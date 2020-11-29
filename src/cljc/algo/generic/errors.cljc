(ns cljc.algo.generic.errors)

(defn illegal-argument [msg]
  (ex-info msg {} :illegal-argument))
