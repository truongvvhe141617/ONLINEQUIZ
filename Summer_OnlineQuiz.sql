USE [Summer_OnlineQuiz]
GO
/****** Object:  Table [dbo].[Quiz]    Script Date: 8/8/2021 11:26:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Quiz](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[question] [nvarchar](max) NOT NULL,
	[option1] [nvarchar](max) NOT NULL,
	[option2] [nvarchar](max) NOT NULL,
	[option3] [nvarchar](max) NOT NULL,
	[option4] [nvarchar](max) NOT NULL,
	[answer] [nvarchar](max) NOT NULL,
	[created_date] [date] NOT NULL,
	[user_id] [int] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 8/8/2021 11:26:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[user_name] [nvarchar](max) NOT NULL,
	[password] [nvarchar](max) NOT NULL,
	[role] [int] NOT NULL,
	[createdDate] [date] NOT NULL,
	[email] [nvarchar](max) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Quiz] ON 

INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (20, N'Tổng số ca nhiễm ngày 18/7/2021 ở Việt Nam là bao nhiêu ?', N'3000', N'4000', N' hơn 5000', N'6000', N'3 4', CAST(N'2021-07-19' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (4, N'Cùng với Hà Nội T&T (vô địch V-League 2010), CLB nào của Việt Nam tham dự AFC Cup 2011', N'Sông Lam Nghệ An', N'SHB Đà Nẵng', N'Hoàng Anh Gia Lai', N'Becamex Bình Dương ', N'1 2', CAST(N'2021-07-19' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (8, N'Bài hát ''''Tây lâu biệt tự'''' là bài nhạc của nước nào?', N'Quảng Bình', N'Quảng Ninh', N'Quảng Trị', N'Quảng Ngãi', N'3', CAST(N'2021-06-26' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (10, N'Ai được bầu làm Tổng bí thư Đảng cộng sản Việt Nam tại Đại hội XI', N'Nguyễn Phú Trọng', N'Nguyễn Sinh Hùng', N'Trương Tấn Sang', N'Nguyễn Tấn Dũng', N'1', CAST(N'2021-06-26' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (11, N'Trong vật nào sau đây không có điện tích tự do?', N'thanh niken', N'khối thủy ngân', N'thanh chì', N'thanh gỗ khô', N'4', CAST(N'2021-06-26' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (12, N'Giải Grand Slam đầu tiên trong năm là giải nào?', N'Austrlia mở rộng', N'Wimbledon', N'Roland Garos', N'Mỹ mở rộng', N'1', CAST(N'2021-06-26' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (13, N'Which option is false about the final keyword?', N'A final method cannot be overridden in its subclasses.', N'A final class cannot be extended.', N'A final class cannot extend other classes.', N'A final method can be inherited.', N'3', CAST(N'2021-06-26' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (14, N'What does the expression float a = 35 / 0 return?', N'0', N'Not a Number', N'Infinity', N'Run time exception', N'3', CAST(N'2021-06-26' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (17, N'Which of the following is a reserved keyword in Java?', N'system', N'strictfp', N'object', N'main', N'1 2', CAST(N'2021-06-26' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (18, N'Which of the following is not a Java features?', N'Dynamic', N'Architecture Neutral', N'Use of pointers', N'Object-oriented', N'2 3', CAST(N'2021-06-25' AS Date), 2)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (19, N'_____ is used to find and fix bugs in the Java programs.', N'JVM', N'JDB', N'JRE', N'JDK', N'2', CAST(N'2021-06-26' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (21, N'Tổng số ca nhiễm ngày 18/7/2021 ở Việt Nam là bao nhiêu ?', N'3000', N'4000', N'hơn 5000', N'6000', N'3 4', CAST(N'2021-07-19' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (28, N'a', N'a', N'a', N'a', N'1', N'2 3', CAST(N'2021-07-22' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (29, N'A!!!', N'a', N's', N'a', N'a', N'1 4', CAST(N'2021-07-22' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (25, N'Hôm nay là thứ mấy', N'thứ 2', N'thứ 3', N'thứ 4', N'thứ 5', N'2', CAST(N'2021-07-20' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (24, N'Hello', N'1', N'2', N'3', N'4', N'1 2', CAST(N'2021-07-19' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (26, N'Ngày 18/7 có tổng cộng bao nhiêu ca nhiễm cả nước ?', N'2000', N'3000', N'5000', N'6000', N'4', CAST(N'2021-07-20' AS Date), 1)
INSERT [dbo].[Quiz] ([id], [question], [option1], [option2], [option3], [option4], [answer], [created_date], [user_id]) VALUES (27, N'a', N'a', N'a', N'a', N'a', N'1 2 3', CAST(N'2021-07-21' AS Date), 1)
SET IDENTITY_INSERT [dbo].[Quiz] OFF
GO
SET IDENTITY_INSERT [dbo].[User] ON 

INSERT [dbo].[User] ([id], [user_name], [password], [role], [createdDate], [email]) VALUES (1, N'truong', N'admin', 1, CAST(N'2021-06-26' AS Date), N'truongvvhe141617@gmail.com')
INSERT [dbo].[User] ([id], [user_name], [password], [role], [createdDate], [email]) VALUES (2, N'sa', N'123', 2, CAST(N'2021-06-25' AS Date), N'bot@gmail.com')
INSERT [dbo].[User] ([id], [user_name], [password], [role], [createdDate], [email]) VALUES (3, N'sa1', N'123', 2, CAST(N'2021-07-20' AS Date), N'0942783802')
INSERT [dbo].[User] ([id], [user_name], [password], [role], [createdDate], [email]) VALUES (4, N'sa12', N'123', 1, CAST(N'2021-07-21' AS Date), N'0942783802')
SET IDENTITY_INSERT [dbo].[User] OFF
GO
