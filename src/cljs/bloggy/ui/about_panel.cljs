(ns bloggy.ui.about_panel
  (:require
   [bloggy.subs :as subs]
   [re-frame.core :as re-frame]))


(defn about-title []
  [:div [:h1 "This is the About Page"]])

(defn link-to-home-page []
  [:div[:a {:href "#/"} "go to Home Page"]])

(defn about-panel []
  [:div
   [about-title]
   [link-to-home-page]])
