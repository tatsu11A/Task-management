Spring Boot タスク管理アプリケーションを作ってみたい

目的
「ログインしたユーザーが、ToDoを登録・確認・更新・完了できるようにする」

機能
1. ログイン機能
・ユーザーID
・パスワード
・ログイン成功でToDo一覧へ遷移
・ログアウトも必要

2. ToDo管理機能
・タスク登録
・タスク一覧表示
・タスク詳細表示
・タスク編集
・タスク削除

3. タスク属性
各タスクに持たせる情報
・タスク名
・内容
・優先度（高・中・低）
・期限
・状況表示
・進捗状況
・完了フラグ

4. 期限比較による状況表示
優先度管理 - 高・中・低の3段階
期限管理 - 本日と比較して状態を表示

5. 進捗管理
以下の3段階する
進捗状況 - 未着手、進行中、レビュー待ち

6. 完了処理
完了機能 - 完了ボタンで完了ページへ移動

目的や特徴
このプロジェクトは、Spring Boot による Web アプリ開発の学習・練習として作成。
以下を学習する。

MVC 構造での開発
Spring Security の導入
JPA での DB 操作
Thymeleaf による画面表示

環境
JDK21
git

フレームワーク
Spring Boot
Spring Web
Thymeleaf
MyBatis Framework
H2 Database
Validation
Spring Boot DevTools

ディレクトリ構成

```
C:.
│  .gitattributes
│  .gitignore
│  mvnw
│  mvnw.cmd
│  pom.xml
│  README.md
├─.mvn
│  └─wrapper
│          maven-wrapper.properties
└─src/main/java/com/example/todo
        │                   ├─ controller
        │                   │     ├─ LoginController
        │                   │     └─ TaskController
        │                   ├─ service
        │                   │     └─ TaskService
        │                   ├─ mapper
        │                   │     └─ TaskMapper
        │                   ├─ entity
        │                   │      ├─ User
        │                   │      └─ Task
        │                   ├─ form
        │                   │      ├─ LoginForm
        │                   │      └─ TaskForm
        │                   └─ TodoApplication
        └─resources/templates
                      ├─ login.html
                      ├─ task-list.html
                      ├─ task-form.html
                      └─ completed-tasks.html
```

**実行**
起動する
```
コマンドプロンプトで実行
mvnw.cmd spring-boot:run
```

## ブラウザアクセス
http://localhost:8080/

## 停止
```
起動中のコマンドプロンプトで、以下を実行
Ctrl + C
```
