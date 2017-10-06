(defproject reifyhealth/quiescent "0.3.2-1"
  :description "A minimal, functional ClojureScript wrapper for ReactJS"
  :url "http://github.com/levand/quiescent"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure           "1.8.0"]
                 [org.clojure/clojurescript     "1.7.228"]
                 [cljsjs/react-transition-group "1.1.3-0"]
                 [cljsjs/react                  "15.1.0-0"]
                 [cljsjs/react-dom              "15.1.0-0"
                  :exclusions [cljsjs/react]]]
  :source-paths ["src"])
