kafka启动：
	启动zookeeper： zkServer
	
	启动PS在D:\kafka_2.12-2.2.0
	.\bin\windows\kafka-server-start.bat .\config\server.properties
	
	创建topic
	.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test
	
	查看topic
	.\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
	
	创建生产者
	.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test
	
	创建消费者
	.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test --from-beginning
