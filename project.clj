(defproject anglican-csis "0.1.0-SNAPSHOT"
  :description "Compiled Inference Library for Anglican"
  :url "https://arxiv.org/abs/1610.09900"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [anglican "1.0.0"]
                 [org.zeromq/jeromq "0.3.3"]
                 [org.zeromq/cljzmq "0.1.4" :exclusions [org.zeromq/jzmq]]
                 [clojure-msgpack "1.2.0"]]
  :plugins [[lein-codox "0.10.1"]])
