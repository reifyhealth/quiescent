(defproject reifyhealth/quiescent "0.3.3-0"
  :description "A minimal, functional ClojureScript wrapper for ReactJS"
  :url "http://github.com/levand/quiescent"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure           "1.8.0"]
                 [org.clojure/clojurescript     "1.7.228"]
                 [cljsjs/react-transition-group "1.1.3-0"]
                 [cljsjs/react                  "16.3.0-1"]
                 [cljsjs/react-dom              "16.3.0-1"
                  :exclusions [cljsjs/react]]
                 [cljsjs/create-react-class     "15.6.2-0"]]
  :source-paths ["src"])
