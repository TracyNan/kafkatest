package kafkatest;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer {

	public static void main(String[] args){
	    Properties props = new Properties();
	    props.put("bootstrap.servers", "localhost:9092");
	    props.put("acks", "all");
	    props.put("retries", 0);
	    props.put("batch.size", 16384);
	    props.put("linger.ms", 1);
	    props.put("buffer.memory", 33554432);
	    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

	    KafkaProducer<String, String> producer = new KafkaProducer<String, String>(props);
//	    for (int i = 0; i < 100; i++)
//	        producer.send(new ProducerRecord<String, String>("topic-test", Integer.toString(i), Integer.toString(i)));
	    producer.send(new ProducerRecord<String, String>("topic-test", "sendMessage", "this is a test from kafka"));
	    producer.close();

	}

}
