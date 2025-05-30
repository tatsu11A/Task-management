Spring Boot タスク管理アプリケーション

機能
ユーザー登録／ログイン機能（Spring Security による）

- タスクの一覧表示
- タスクの登録（追加）
- タスクの詳細確認

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
Thymeleaf
Spring Security
H2 Database
JPA (Hibernate)

ディレクトリ構成

src
└── main
├── java
│ └── com.example.demo.taskmanager
│ ├── controller # Web コントローラ（画面制御）
│ │ ├── TaskController.java
│ │ └── HomeController.java ← "/" アクセス用
│ ├── model # タスクのモデル（Entity）
│ ├── repository # DB アクセス用（JPA）
│ └── service # ビジネスロジック
└── resources
├── templates # HTML テンプレート（Thymeleaf）
│ ├── task_list.html
│ ├── task_form.html
│ └── task_detail.html
└── application.properties

エラー対応メモ
Whitelabel Error Page（404）
原因：
ブラウザで / にアクセスしたが、対応するコントローラーが存在しない。

解決：
HomeController を追加して / にアクセスされたとき redirect:/tasks に誘導するよう修正。

アプリを実行
mvnw.cmd spring-boot:run

※ Java 21 以上が必要です。

アプリ起動後、ブラウザで以下にアクセスしてください
http://localhost:8080/
