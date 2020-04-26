(ns tic-tac-toe.core)

(defn isNotMarkedFunc [player] 
  (fn [value] 
    (not= player value)))

(defn winner? [player line] 
  (nil? 
    (some 
      (isNotMarkedFunc player) line)))
