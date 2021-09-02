(ns repro.app
  (:require
    [meander.epsilon :as me]))

(defn f
  []
  (me/match {:a 1
             :b 2}
    {:a (me/some ?a)
     & (me/cata ?rest)}
    {:aa ?a
     :rest ?rest}

    {:b ?b}
    {:bb ?b}))

(defn ^:export main
  []
  (f))
