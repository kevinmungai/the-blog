(ns bloggy.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [bloggy.core-test]))

(doo-tests 'bloggy.core-test)
