(require 'cljs.repl)
(require 'cljs.repl.nashorn)

(cljs.repl/repl* (cljs.repl.nashorn/repl-env)
                {:output-dir "target/out"
                 :optimizations :none
                 :cache-analysis true                
                 :source-map true})
