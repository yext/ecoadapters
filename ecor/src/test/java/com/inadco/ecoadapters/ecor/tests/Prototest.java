package com.inadco.ecoadapters.ecor.tests;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;

public class Prototest {
    
    public static void prototest () throws Exception {
        
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);
//        fs.copyFromLocalFile(delSrc, overwrite, src, dst)
//        fs.de
        Job j;
//        j.setReducerClass(null);
//        j.setMapOutputKeyClass(theClass))
//        Text ;
//        BytesWritable bw = null;
        
        
    }

}
