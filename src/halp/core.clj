(ns halp.core
  (:require [clojure.java.io :as io])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (-> "hi.txt"
      io/resource
      io/file
      (io/copy *out*)))
