(ns com.atomist.cljs-example-editor.core)

(defn edit 
  "Add a README file to a project"
  [project]
  (. project (editWith "AddLicenseFile" (clj->js {"license_name", "gpl-3.0"}))))

; export necessary var for rug JS parser
(set! js/editor (js-obj "edit" edit "name" "AddGpl3LicenseFile" "description" "Adds a README file to a project"))
