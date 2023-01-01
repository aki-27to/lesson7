# 課題７ １２時間以上かけてほとんど進まず心が折れかけです。。自走力も低いので少々投げやりな質問かもしれません。。何卒ご確認をよろしくお願いいたしましす。

■やりたいこと

〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜
% curl 'http://localhost:8080/names' \
-H 'Content-Type: application/json' \　　　　　　
-d '{　　　　　　　　　　　　　　　
 "name": "koyama"
}'

実行結果；　name successfully created
〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜

・-H 'Content-Type: application/json'とは
　・「メディアタイプを指定する」もの。
　・上記の例ではJSONを指定している。
　・参考：https://tech.stmn.co.jp/entry/2021/03/15/183722
・-d以降はサーバに送信するデータでリクエストボディという。
　・-d '{"name": "koyama"}'
・実行結果は「name successfully created」を表示する。

■質問内容
Q1.上記を実行すると、「koyama」がリスト？に登録され、うまくいった場合には実行結果を返すような理解でよろしいでしょうか？
　　　　　　
Q２.「koyama」がリストに登録するために

Q３.課題７の一つ目「http://localhost:8080/names?name=koyama のようにクエリ文字列を受け取れるようにする」について
　　　　　googleのchromeで「http://localhost:8080/names?name=koyama」を入れるとkoyamaと表示されるのですが、これはできてるのでしょうか。。。
