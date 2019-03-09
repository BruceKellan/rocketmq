package org.apache.rocketmq.common.brucekellan;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;

/**
 *
 */
public class JMXTestCase {

    public static void main(String[] args) {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        System.out.println(runtime.getName());
    }

}
