package RedisJavaKeys实例;

import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisKeyJava {

	public static void main(String[] args) {
		Jedis jedis = new Jedis("localhost");
		System.out.println("Connection to server sucessfully");
		Set<String> set = jedis.keys("*");
		for ( String key : set ) {
			System.out.println("List of stored keys : " + key);
		}
	}

}
