(ns bloggy.ui.home_panel
  (:require
   [bloggy.subs :as subs]
   [re-frame.core :as re-frame]
   [bloggy.ui.preview :refer [preview]]))


(defn center [child]
  [:div.columns.is-centered
   [:div.column.is-6-desktop.is-12-mobile
    child]])

(defn home-title []
  [center
   [:a {:href "#/"} [:h1.has-text-centered.title "Kevin Mungai"]]])

(defn title [{:keys [name index]}]
  (let [link (str "#/" name)] 
    [:p {:class "control"
         :key index}
     [:a.button.is-text {:href link} name]]))

(def links [{:name "portfolio" :index 1} {:name "about" :index 2} {:name "sugar" :index 3}])

(defn linkss []
  [:div.field.is-grouped.is-grouped-centered
   (map #(title %) links)])


(def sample
  {:heading "heading"
   :date "today"
   :tag "tag"
   :text "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Lacus vel facilisis volutpat est velit. Non blandit massa enim nec dui nunc. Velit ut tortor pretium viverra. Senectus et netus et malesuada fames ac turpis. Imperdiet nulla malesuada pellentesque elit eget gravida cum sociis. Consequat ac felis donec et odio. Aliquam etiam erat velit scelerisque. Ut tristique et egestas quis. Nascetur ridiculus mus mauris vitae. Vel risus"})

(defn home-panel []
  [:div
   [home-title]
   [linkss]
   [preview sample]
   [preview sample]
   [preview sample]
   ])
