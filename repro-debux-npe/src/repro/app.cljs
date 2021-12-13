(ns repro.app
  (:require
   [debux.cs.core]
   [debux.cs.util]))

(defn f1
  [v]
  #d/dbgn (do
            #_(println v)
            (v)))

(defn ^:export main
  []
  (println "Main!"))


(comment
  (f1 #(println 123))
  ())
