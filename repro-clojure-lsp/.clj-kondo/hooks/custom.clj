(ns hooks.custom
  (:require [clj-kondo.hooks-api :as api]))

(defn transform-gen-bindings
  [body]
  (doto
    (api/list-node
      (list
        (api/token-node 'let)
        (api/vector-node (map api/token-node ['foo 1 'bar 2]))
        body))
    #_println))


(defn gen-bindings-hook [{:keys [node]}]
  {:node (transform-gen-bindings (-> node :children rest first))})
