# 課題７ 

１２時間以上かけてほとんど進まず心が折れかけです。。

自走力もまだまだ低いので少々投げやりな質問かもしれません。。

何卒ご確認をよろしくお願いいたしましす。

※わからないことが多く、仮説が立てられず、ひたすらがむしゃらに調べている状況です。

■やりたいこと

〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜

% curl 'http://localhost:8080/names' \

-H 'Content-Type: application/json' \　　　　　　

-d '{　　　　　　　　　　　　　　　

"name": "koyama"

}'

実行結果としてname successfully createdを返す。

〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜


■質問内容

Q1.上記を実行すると、「koyama」がリストか何か（DBのイメージ）に登録され、うまくいった場合には実行結果を返すような理解でよろしいでしょうか？
　　　　　　
      
Q２.「koyama」をリストに登録するために-d'{"name": "koyama"}'を依頼していると思うのですが、これをどうやってnamesで処理し、登録するのか検討もつかないという状況です。何が分かっていないでしょうか？？ここでかれこれ３日以上詰まっております。。。

Q３.課題７の一つ目「http://localhost:8080/names?name=koyama のようにクエリ文字列を受け取れるようにする」について

   googleのchromeで「http://localhost:8080/names?name=koyama」　
   
   を入れるとkoyamaと表示されるのですが、これはできてるのでしょうか。。。
   
■調べてわかったこと

・-H 'Content-Type: application/json'とは

・「メディアタイプを指定する」もの。

・上記の例ではJSONを指定している。

・参考：https://tech.stmn.co.jp/entry/2021/03/15/183722

・-d以降はサーバに送信するデータでリクエストボディという。

・実行結果は「name successfully created」を表示する。
