import Flutter
import UIKit

public class WortiseErrorTextView: NSObject, FlutterPlatformView {

    fileprivate var message: String

    fileprivate lazy var textView: UITextView = {
        let textView = UITextView()

        textView.backgroundColor = .red
        textView.text            = message
        textView.textColor       = .yellow

        return textView
    }()


    init(_ message: String) {
        self.message = message
        super.init()
    }

    public func view() -> UIView {
        return textView
    }
}
