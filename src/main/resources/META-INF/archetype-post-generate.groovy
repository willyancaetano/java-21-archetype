file = new File( request.getOutputDirectory(), request.getArtifactId()+"/__gitignore__" );
def gitIgnorefile = new File( request.getOutputDirectory(), request.getArtifactId()+"/.gitignore" );
file.renameTo(gitIgnorefile)