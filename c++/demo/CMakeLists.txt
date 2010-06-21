include_directories (${DRAGON3D_SOURCE_DIR}/src)
link_directories (${DRAGON3D_BINARY_DIR}/src)
add_executable (dragon3DDemo dragon3d.cpp)
target_link_libraries (dragon3DDemo 
    Dragon3D
    ${Boost_LIBRARIES}
    )
