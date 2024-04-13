使用windows form 劃出
1個輸入框
1個輸出框
1個啟動按鈕

按鈕觸發內容
輸入內容放入input
建立List<int> indices 空值 來放輸出值
用RegularExpressions來分析input 並讀取 x=的值
確認x符合規範a-z
用RegularExpressions來分析input 並讀取 words=的值
確認words 跟 words[i]符合規範
確認每一個words 是否有包含 x的值
true 就把[i] index 放入 indices

最後把indices內的值合併並顯示於輸出框