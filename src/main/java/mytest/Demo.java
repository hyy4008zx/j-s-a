package mytest;


import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class Demo {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);
//        DataStreamSource<String> streamSource = env.readTextFile("hdfs://hmcs031:9000/UDmodels/RawData/config.properties");
//        streamSource.print();
//        env.execute();
    }
}
