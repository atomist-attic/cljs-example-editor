(defproject com.atomist/cljs-example-editor "0.1.0-SNAPSHOT"
  :description "An example editor based on ClojureScript"
  :dependencies [[org.clojure/clojurescript "1.9.293"]
                 [org.clojure/clojure "1.9.0-alpha14"]]
  :plugins [[lein-cljsbuild "1.1.4" :exclusions [org.clojure/clojure]]]
  :hooks [leiningen.cljsbuild]
  :cljsbuild {
    :builds [{
        :source-paths ["src"]
        :compiler {
          :output-to ".atomist/editors/Editor.js"
          :externs ["externs.js"]
          :optimizations :advanced
          :pretty-print true}}]} )
