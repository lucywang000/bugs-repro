(ns repro.foo
  (:require
   ["/repro/bar.js" :refer [dict v]]
   ["/repro/schema-basic.js" :refer [schema nodes]]))

(defn ^:export go []
  v
  (println dict)
  (println nodes)
  #_(println schema))

(go)
