package com.thecodinglive.maven;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	List<String> datas = Lists.newArrayList("maven", "gradle");
    	String joined;
    	
    	joined = Joiner.on(",")
    			.skipNulls()
    			.join(datas);
    	
        System.out.println(joined);
    }
}
