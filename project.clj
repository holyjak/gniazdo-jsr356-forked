(defproject stylefruits/gniazdo "2.0.0-SNAPSHOT"
  :description "A WebSocket client for Clojure"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.glassfish.tyrus/tyrus-client "1.9"]
                 [org.glassfish.tyrus/tyrus-container-grizzly-client "1.9"] ;; or tyrus-container-jdk-client
                 [javax.websocket/javax.websocket-api "1.1"]]
  :source-paths      ["src"]
  :java-source-paths ["src-java"]
  :repl-options {:init-ns gniazdo.core}
  :profiles {:dev
             {:dependencies [[http-kit "2.1.19"]]}})
