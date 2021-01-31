# これは何か

Spring Boot + Spring Securityを使った簡単なサンプルアプリです。

# ユーザー情報

`src\main\java\resources\data.sql`に以下のデータとして初期値登録をしています。
この情報を使ってログインすることが可能です。

| email | password | roles |
| ----- | -------- | ----- |
| test@example.com | test | ROLE_USER,ROLE_ADMIN |
| test2@example.com | testtest | ROLE_USER,ROLE_ADMIN |

`password`欄はBCryptのハッシュ値に`{bcrypt}`を先頭につけています。`{bcrypt}`を先頭でつけることでSpring Securityがハッシュ化の方法を判別できるようにしています。

BCryptのハッシュ値の計算はWeb上にあるツールなどを使って求めました。

# 参考

- [Spring Security と Spring Bootで最小機能のデモアプリケーションを作成する](https://qiita.com/rubytomato@github/items/8eee9e3fa86c89dd305c)
- [Thymeleafチートシート](https://qiita.com/NagaokaKenichi/items/c6d1b76090ef5ef39482)
