cmake_minimum_required (VERSION 2.6) 
project (DRAGON3D)

find_package( Boost 1.42 COMPONENTS string)

link_directories ( ${Boost_LIBRARY_DIRS} )
include_directories ( 
    ${Boost_INCLUDE_DIRS} 
    ${DRAGON3D_SOURCE_DIR}/include
    ${DRAGON3D_SOURCE_DIR}
    )

add_subdirectory(src)
add_subdirectory(demo)

