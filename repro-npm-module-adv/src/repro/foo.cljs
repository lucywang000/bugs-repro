(ns repro.foo
  (:require
   ["/repro/bar.js" :refer [dict]]))

(defn ^:export go []
  (println dict))

(go)
