# compile AND install R package. 
# need to have R, rJava  and have a sudo 
# for this to work. Also have maven executable around

MVN='mvn clean install -DskipTests -DR'
ver=0.4.2-SNAPSHOT

sudo R CMD REMOVE ecor; { $MVN && sudo HADOOP_HOME=$HADOOP_HOME R_COMPILE_PKGS=1 R CMD INSTALL --build target/ecor-${ver}-rpkg; }
