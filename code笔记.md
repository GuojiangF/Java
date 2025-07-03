### 1. 两数之和   
以空间换时间， 用hashmap记录数组元素和下标，然后依次检测contains  
### 2. 字母异位词分组
以空间换时间，用hashmap 记录字符串排列数组作为值， HashMap<String, List<String>> map = new HashMap<>()，并将入参的每个str进行排序后作为key  
### 3. 最长连续序列
去重， 后遍历**set**并判断元素值减一是否存在，不存在重新计数length=1, 然后判断元素值+1是否存在，存在length+1， 然后结束后，取legnth和当前max最大值。
