
#import "RNUncaughtExceptionReporter.h"

@implementation RNUncaughtExceptionReporter

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(listenToErrors:(RCTResponseSenderBlock)callback)
{
    //callback(@[@"hello from ios"]);
}

@end
  