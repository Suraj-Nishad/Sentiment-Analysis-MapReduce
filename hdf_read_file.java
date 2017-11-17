// if you wanna run the code on HDFS

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class Cat{
    public static void main (String [] args) throws Exception{
        try{
            Path pt=new Path("hdfs:/path/to/file");//Location of file in HDFS
            FileSystem fs = FileSystem.get(new Configuration());
            BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(pt)));
            String line;
            line=br.readLine();
            while (line != null){
                System.out.println(line);
                line=br.readLine();
            }
        }catch(Exception e){
        }
    }
}

// Revised
// Driver

public class ReadFile {

    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        Job job = new Job(conf, "Read a File");


        FileSystem fs = FileSystem.get(conf);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        if (fs.exists(new Path(args[1])))
            fs.delete(new Path(args[1]), true);
        job.setMapperClass(Map.class);
        job.setReducerClass(Reduce.class);

        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        job.setJarByClass(ReadFile.class);     
        job.waitForCompletion(true);
    }

}

// Mapper

public class Map extends Mapper<LongWritable, Text, Text, IntWritable> {

    public void setup(Context context) throws IOException{
        Path pt=new Path("hdfs:/path/to/file");//Location of file in HDFS
        FileSystem fs = FileSystem.get(new Configuration());
        BufferedReader br=new BufferedReader(new InputStreamReader(fs.open(pt)));
        String line;
        line=br.readLine();
        while (line != null){
            System.out.println(line);
            line=br.readLine();
        }
    }
    public void map(LongWritable key, Text value, Context context)
            throws IOException, InterruptedException {
      //as your wish
        }
    }
}