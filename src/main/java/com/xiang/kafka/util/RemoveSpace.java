package com.xiang.kafka.util;

public class RemoveSpace {
    public static void main(String[] args) {
        String s = "Range 是对每个 topic 而言的。\n" +
                "首先对同一个 topic 里面的分区按照序号进行排序，并对消费者按照字母顺序进行排序。\n" +
                "假如现在有 7 个分区，3 个消费者，排序后的分区将会是0,1,2,3,4,5,6；消费者排序完之后将会是C0,C1,C2。\n" +
                "通过 partitions数/consumer数 来决定每个消费者应该消费几个分区。如果除不尽，那么前面几个消费者将会多消费 1 个分区。\n" +
                "例如，7/3 = 2 余 1 ，除不尽，那么 消费者 C0 便会多消费 1 个分区。 8/3=2余2，除不尽，那么C0和C1分别多消费一个。通过 partitions数/consumer数 来决定每个消费者应该消费几个分区。如果除不尽，那么前面几个消费者将会多消费 1 个分区。分区分配策略之Range注意：如果只是针对 1 个 topic 而言，C0消费者多消费1个分区影响不是很大。但是如果有 N 多个 topic，那么针对每个 topic，消费者 C0都将多消费 1 个分区，topic越多，C0消费的分区会比其他消费者明显\n";
        String replace = s.replace(" ", "");
        System.out.println(replace);
    }
}
