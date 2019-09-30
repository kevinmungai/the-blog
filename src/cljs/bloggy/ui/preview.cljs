(ns bloggy.ui.preview
  )

(defn center [child]
  [:div.columns.is-centered
   [:div.column.is-6-desktop.is-12-mobile
    child]])


(defn header [text]
  [center
   [:p.title.is-4.has-text-centered
    text]])

(defn date-and-tag [date tag]
  (let [text (str date " in " tag)]
    [center [:p.has-text-centered.is-size-7 text]]))

(defn preview-text [text]
  [center [:p.has-text-centered text]])

(defn read-more []
  [center
   [:p.has-text-centered
    [:a.button.is-light {:href "#/read-more"} "read more"]]])

(defn preview
  [{:keys [heading date tag text]}]
  [:div.box.is-shadowless
   [header heading]
   [date-and-tag date tag]
   [preview-text text]
   [read-more]])
