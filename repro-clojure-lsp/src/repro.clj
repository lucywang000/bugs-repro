(ns repro)

;; See .clj-kondo/hooks/custom.clj for the custom hook for this macro.
(defmacro gen-bindings [& body]
  `(let [~'foo 1
         ~'bar 2]
     ~@body))

(defn f []
  (gen-bindings
   ;; `clj-kondo --lint` prints (correctly):
   ;;   warning: unused binding foo
   ;;   error:   Unresolved symbol: foo1
   ;; clojure-lsp crashes
   (+ foo1 bar)))
