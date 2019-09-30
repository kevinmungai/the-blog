(ns bloggy.views
  (:require
   [re-frame.core :as re-frame]
   [re-com.core :as re-com]
   [bloggy.subs :as subs]
   [bloggy.ui.home_panel :refer [home-panel]]
   [bloggy.ui.about_panel :refer [about-panel]]
   ))


;; main

(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    :about-panel [about-panel]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    [re-com/v-box
     :height "100%"
     :children [[panels @active-panel]]]))
