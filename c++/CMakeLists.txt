cmake_minimum_required (VERSION 2.6) 
project (DRAGON3D)

#set(GTEST_DIR ${CMAKE_CURRENT_SOURCE_DIR}/gtest-1.6.0)
set(GTEST_DIR gtest-1.6.0)
set(GTEST_INCLUDE_DIR ${GTEST_DIR}/include)
#set(GTEST_LIBRARY ${GTEST_DIR}/build/libgtest.a)
#set(GTEST_MAIN_LIBRARY ${GTEST_DIR}/build/libgtest_main.a)
#set(GTEST_LIBRARY_DIRS ${GTEST_LIBRARY} ${GTEST_MAIN_LIBRARY})

find_package(Boost)

link_directories ( ${Boost_LIBRARY_DIRS} )

include_directories ( 
    ${Boost_INCLUDE_DIRS} 
    ${DRAGON3D_SOURCE_DIR}/include
    ${DRAGON3D_SOURCE_DIR}
    )

add_subdirectory(src)
add_subdirectory(demo)
add_subdirectory(gtest-1.6.0)


enable_testing()
link_directories ( ${GTEST_LIBRARY_DIRS} )
set(MEMORYCHECK_COMMAND_OPTIONS "--trace-children=yes")
#find_package(GTest REQUIRED)
include(cmake/internal_utils.cmake)
include_directories(${GTEST_INCLUDE_DIR})
cxx_test(testtest gtest)
add_definitions(-fprofile-arcs -ftest-coverage)
target_link_libraries(testtest -fprofile-arcs ${GTEST_LIBRARIES})
include(CTest)
