(ns repro)

;; See .clj-kondo/hooks/custom.clj for the custom hook for this macro.
(defmacro gen-bindings [& body]
  `(let [~'foo 1
         ~'bar 2]
     ~@body))

(defn f []
  (gen-bindings
   ;; `clj-kondo --lint` prints (correctly):
   ;;   repro-clojure-lsp/src/repro.clj::: warning: unused binding foo
   ;;   repro-clojure-lsp/src/repro.clj:15:7: error: Unresolved symbol: foo1
   ;; clojure-lsp crashes
   (+ foo1 bar)))
