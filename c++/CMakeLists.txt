cmake_minimum_required (VERSION 2.6) 
project (DRAGON3D)


find_package(Boost)
#find_package(gtest REQUIRED)

link_directories ( ${Boost_LIBRARY_DIRS} )
#link_directories ( ${GTEST_LIBRARY_DIRS} )

include_directories ( 
    ${Boost_INCLUDE_DIRS} 
    ${DRAGON3D_SOURCE_DIR}/include
    ${DRAGON3D_SOURCE_DIR}
    )

add_subdirectory(src)
add_subdirectory(demo)


enable_testing()
set(MEMORYCHECK_COMMAND_OPTIONS "--trace-children=yes")
find_package(GTest REQUIRED)
include(cmake/internal_utils.cmake)
include_directories(${GTEST_INCLUDE_DIRS})
cxx_test(testtest gtest)
add_definitions(-fprofile-arcs -ftest-coverage)
target_link_libraries(testtest -fprofile-arcs ${GTEST_LIBRARIES})
include(CTest)
