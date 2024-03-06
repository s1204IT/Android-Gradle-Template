# Android Gradle サンプルプロジェクト
[![Build](https://github.com/s1204IT/Android-Gradle-Template/actions/workflows/build.yml/badge.svg)](https://github.com/s1204IT/Android-Gradle-Template/actions/workflows/build.yml)

## ビルド
基本は Actions から行う様に設計しています。

このリポジトリをクローンし、この README とマニフェスト等のビルドに関するファイルを修正した後、新たなリポジトリに Initial Commit をしてください。  
ライセンスは載せていないので、@s1204IT のペアコミットやクレジットの記載は不要です。

下準備
```bash
git clone git@github.com:s1204IT/Android-Gradle-Template --de 1
cd Android-Gradle-Template
rm -rf .git docs/
```

移行 (master ブランチの場合)
```bash
git init
git branch -M master
git remote add origin git@github.com:user/repo
git add -A
git commit -m "Initial Commit"
git push -u origin master
```

## カスタム
このプロジェクトの構成ではAPKがインストール出来るだけのアプリとなっています。  
少なくとも以下の構成を編集する必要があります。  
- パッケージID
  - `app/build.gradle` の `android.namespace`
  - `app/src/main/java/` 以下のディレクトリ
- アプリ名
  - `settings.gradle` の `rootProject.name`
  - マニフェスト(後述)の `application` タグ内の `android.label`

その他アイコン等。  
AndroidManifest については、 [公式ブログ](https://developer.android.com/guide/topics/manifest/manifest-intro?hl=ja "アプリ マニフェストの概要  |  Android Developers")等に詳細が載っているので調べて見てください。

## 変数一覧
全て **Secrets** です
- **STORE_FILE**
  - JKS形式のキーストアファイルを Base64 でエンコードした文字列
- **STORE_PASSWORD**
  - キーストアのパスワード
- **KEY_ALIAS**
  - 署名の名前
- **KEY_PASSWORD**
  - 署名のパスワード

## ファイル
- app-**debug**.apk : testkey
- app-**release**.apk : Self-signed

---

### Stub APK の作成

こちらをご利用ください｡  
[**Android-Stub-APK-Maker**](https://github.com/s1204IT/Android-Stub-APK-Maker "s1204IT/Android-Stub-APK-Maker")
