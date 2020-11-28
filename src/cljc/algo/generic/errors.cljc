(ns cljc.algo.generic.errors)

(defmacro deferror [name]
  `(defn ~name [msg#]
     (ex-info msg# {} ~(keyword name))))

(deferror illegal-argument)
