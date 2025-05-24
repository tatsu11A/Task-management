Spring Boot タスク管理アプリケーション

機能
ユーザー登録／ログイン機能（Spring Security による）

タスクの作成・編集・削除

タスクの一覧表示（ログインユーザーごと）

タスクの状態（未完了、完了など）の切り替え

目的や特徴
このプロジェクトは、Spring Boot による Web アプリ開発の学習・練習として作成された可能性が高いです。
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

Task-management/
├── src/
│ ├── main/
│ │ ├── java/com/example/taskmanagement/
│ │ │ ├── controller/ # Web コントローラー
│ │ │ ├── entity/ # エンティティ（DB モデル）
│ │ │ ├── repository/ # リポジトリ（DB 操作）
│ │ │ ├── service/ # ビジネスロジック層
│ │ │ └── TaskManagementApplication.java
│ │ └── resources/
│ │ ├── templates/ # HTML テンプレート（Thymeleaf）
│ │ └── application.properties
