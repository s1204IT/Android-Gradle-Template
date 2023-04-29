# Android Gradle サンプルプロジェクト
[![Build](https://github.com/s1204IT/Android-Gradle-Template/actions/workflows/build.yml/badge.svg)](https://github.com/s1204IT/Android-Gradle-Template/actions/workflows/build.yml)

## 使用例
システムアプリの埋め込みに使用します。  
署名だけ合わせて後からアップデートの形で上書きします。  

Gradleを用いるメリットは､ `META-INF/` を作成させないポイントです。
  - minSdk が **24** 以上である必要が有ります。

## ファイル

- app-**debug**.apk : Signed TestKey
- app-**release**.apk : Un-signed
