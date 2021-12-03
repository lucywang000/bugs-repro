(ns repro.foo-test
  (:require [repro.foo :as foo]
            [cljs.test :as t :refer [deftest is testing use-fixtures]]))


(deftest footest1
  (is (= (foo/increase 1) 2)))

(deftest ^:skip footest2
  (is (= (foo/increase 2) 100)))
