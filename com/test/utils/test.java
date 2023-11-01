package com.test.utils;

public class test {



        public static void main(String[] args) {





            String str = "{";
            str = str + "\"filters\": {";
            str = str + "\"exclude_extra_style\": true,";
            str = str + "\"stock_out_rate\": {";
            str = str + "\"gt\": 1";
            str = str + "},";
            str = str + "\"categories\": [";
            str = str + "\"mens-clothes\",";
            str = str + "\"kids-shoes\"";
            str = str + "],";
            str = str + "\"retailers\": [";
            str = str + "\"108\",";
            str = str + "\"2\"";
            str = str + "],";
            str = str + "\"brands\": [";
            str = str + "\"11854\",";
            str = str + "\"13063\"";
            str = str + "]";

            str = str + "},";
            str = str + "\"user\": {";
            str = str + "\"name\": \"teste\"";
            str = str + "},";
            str = str + "\"version\": 1,";
            str = str + "\"target_field\": [";
            str = str + "\"product_count\"";
            str = str + "],";
            str = str + "\"analysis_type\": \"brands\",";
            str = str + "\"analysis_match_type\": \"retailers\"";
            str = str + "}";

            String blogName = "Java2blog is java blog";
            System.out.println("BlogName: "+blogName);
            // Let\"s put Java2blog in double quotes
            String blogNameWithDoubleQuotes =  "\"Java2blog\" is java blog";
            //String blogNameWithDoubleQuotes2 =  "\"filters\" : { is java blog";
            //System.out.println("BlogName with double quotes: "+blogNameWithDoubleQuotes2);
            System.out.println(str);
        }

}
