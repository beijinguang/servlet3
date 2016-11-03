echo "生成maven archetype"
mvn clean
mvn archetype:create-from-project
cd target/generated-sources/archetype
mvn clean install
echo "结束"
