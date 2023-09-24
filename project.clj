(defproject servidor-clojure "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.2.0"]
                 [clj-time "0.14.0"]
                 [compojure "1.6.0"]]
  :repl-options {:init-ns servidor-clojure.core}
  :main servidor-clojure.core)
