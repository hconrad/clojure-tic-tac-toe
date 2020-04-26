(ns tic-tac-toe.core-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.core :refer :all]))
(def winner-input 
  [ 
   { :player "X" :line ["X" "X" "X"]}
   { :player "O" :line ["O" "O" "O"]}
  ])
(deftest winner-test
  (is (winner? "X" ["X" "X" "X"])))

(defn winner-single-test [entry] 
  (is (winner? (get entry :player) (get entry :line))))

(deftest full-winner-test 
  (for [entry winner-input] 
    (winner-single-test entry)))
